import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import User from '../models/user';

const BASE_URL = 'https://jsonplaceholder.typicode.com/users';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-type': 'application/json' }),
};

@Injectable({
  providedIn: 'root',
})
export class UserService {
  private userInfoSubject = new Subject<User>();
  userInfo$ = this.userInfoSubject.asObservable();

  constructor(private http: HttpClient) {}

  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(`${BASE_URL}`, httpOptions);
  }

  getUsersById(id: number): Observable<User> {
    return this.http.get<User>(`${BASE_URL}/${id}`, httpOptions);
  }

  getUserInfoAndEmit(id: number) {
    this.getUsersById(id).subscribe({
      next: (user) => {
        console.log(user);
        this.userInfoSubject.next(user);
      },
      error: (error) => {
        console.error('Error fetching user info:', error);
      },
    });
  }
}
