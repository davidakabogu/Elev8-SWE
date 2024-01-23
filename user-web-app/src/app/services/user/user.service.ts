import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import User from '../../models/user';
import { Observable } from 'rxjs';

const BASE_URL = 'https://jsonplaceholder.typicode.com/users'

const httpOptions = {
  headers: new HttpHeaders({'Content-type': 'application/json'})
}

@Injectable({
  providedIn: 'root',
})

export class UserService {
  
  constructor(private http: HttpClient) {}

  getUsers(): Observable<User[]> {
    return this.http.get<User[]>(`${BASE_URL}`, httpOptions);
  }

  getUserById(id: string): Observable<User[]> {
    return this.http.get<User[]>(`${BASE_URL}`);
  }
}