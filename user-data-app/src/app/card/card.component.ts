import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import User from '../models/user';
import { UserService } from '../services/user.service';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {
  users: Observable<User[]> = this.userService.getUsers();
  constructor(private userService: UserService) {}

  getUserInfo(id: number) {
    this.userService.getUserInfoAndEmit(id);
  }
}
