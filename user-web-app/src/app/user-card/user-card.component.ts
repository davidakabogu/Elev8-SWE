import { Component } from '@angular/core';
import User from '../models/user';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-user-card',
  standalone: true,
  imports: [AppComponent],
  templateUrl: './user-card.component.html',
  styleUrl: './user-card.component.css',
})
export class UserCardComponent {
  users: User[] = [];
}
