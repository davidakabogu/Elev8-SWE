import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  myList: string[] = [];
  newItem: string = '';
  title: string = "List App";

  addItem(event: Event) {
    this.newItem = (event.target as HTMLInputElement).value;
    if (this.newItem !== null && !this.myList.includes(this.newItem)) {
      this.myList.push(this.newItem);
      this.newItem = '';
    } else {
      this.newItem = '';
    }
  }
  clearList() {
    this.myList = [];
    this.newItem = '';
  }
}
