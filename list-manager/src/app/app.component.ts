import { Component, Input } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

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

  addItem(event: Event) {
    this.newItem = (event.target as HTMLInputElement).value;
    if (this.newItem.trim() !== '' && !this.myList.includes(this.newItem)) {
      this.myList.push(this.newItem);
      this.newItem = '';
    }
  }
  clearList() {
    this.myList = [];
    this.newItem = '';
  }
}
