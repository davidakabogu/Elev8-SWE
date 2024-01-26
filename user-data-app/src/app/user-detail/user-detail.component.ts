import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import User from '../models/user';

@Component({
  selector: 'app-user-detail',
  standalone: true,
  imports: [],
  templateUrl: './user-detail.component.html',
  styleUrl: './user-detail.component.css',
})
export class UserDetailComponent implements OnInit {
  userInfo!: User;
  constructor(private userService: UserService) {}
  ngOnInit(): void {
    this.userService.userInfo$.subscribe((user) => {
      this.userInfo = user;
    });
  }
}
