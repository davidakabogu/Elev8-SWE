import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Dish } from './models/dish';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit {
  title = 'Dishes Web App';
  dishes: Dish[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get<Dish[]>('').subscribe((data) => (this.dishes = data));
  }
}
