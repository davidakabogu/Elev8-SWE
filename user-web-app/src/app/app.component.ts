import { UserService } from './services/user/user.service';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import User from './models/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  imports: [CommonModule, RouterOutlet, RouterLink, RouterLinkActive],
})
export class AppComponent implements OnInit {
  constructor(private userService: UserService, private router: Router) {}

  title = 'User Web App';
  users: User[] = [];

  showUserDetails(userId: number): void {
    // Navigate to the user-card component with the user ID as a parameter
    this.router.navigate(['/user-card', userId]);
  }

  ngOnInit(): void {
    this.loadData();
  }

  loadData(): void {
    this.userService.getUsers().subscribe({
      next: (data) => {
        this.users = data;
      },
      error: (error) => {
        console.log('Error occured check configurations!');
      },
      complete: () => console.info('Data Successfully Retrieved'),
    });
  }
}
