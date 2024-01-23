import { UserService } from './services/user/user.service';
import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import User from './models/user';
import { CommonModule } from '@angular/common';
import { UserCardComponent } from './user-card/user-card.component';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  imports: [RouterOutlet, CommonModule, UserCardComponent],
})
export class AppComponent implements OnInit {
  title = 'User Web App';
  users: User[] = [];

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.loadData();
  }

  loadData(): void {
    this.userService.getUsers().subscribe({
      next: (data) => {
        this.users = data;
      },
      error: (error) => {
        console.log('There is an error');
      },
      complete: () => console.info('Data retrieved'),
    });
  }
}
