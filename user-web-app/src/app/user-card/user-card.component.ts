import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user/user.service';
import User from '../models/user';
import { CommonModule } from '@angular/common';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user-card.component.html',
  styleUrl: './user-card.component.css',
})
export class UserCardComponent implements OnInit {
  userId: number | null = null;
  userDetails: User | null = null; // Adjust the type based on your user data structure

  constructor(
    private userService: UserService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.loadData();
  }

  loadData() {
    const userIdParam = this.route.snapshot.paramMap.get('id');
    if (userIdParam !== null) {
      const userIdNumber = +userIdParam; // Convert the string to a number
      if (!isNaN(userIdNumber)) {
        this.userService.getUserById(userIdNumber).subscribe({
          next: (data) => {
            this.userDetails = data;
          },
          error: (error) => {
            console.log('Error occured');
          },
          // complete: () => console.info(this.userDetails?.name),
          complete: () => console.info('user details retrieved'),
        });
      }
    } else {
      console.error('User ID parameter is null.');
    }
  }
}
