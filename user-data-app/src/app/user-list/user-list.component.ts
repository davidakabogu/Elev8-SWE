import User from '../models/user';
import { Component } from '@angular/core';
import { UserService } from '../services/user.service';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';
import { CardComponent } from '../card/card.component';

@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [CommonModule, CardComponent],
  templateUrl: './user-list.component.html',
  styleUrl: './user-list.component.css',
})
export class UserListComponent {
  users: Observable<User[]> = this.userService.getUsers();
  constructor(private userService: UserService) {}
}
