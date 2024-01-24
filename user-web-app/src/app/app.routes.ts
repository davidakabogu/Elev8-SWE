import { Routes, RouterModule } from '@angular/router';
import { UserCardComponent } from './user-card/user-card.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
  { path: 'user-card/:id', component: UserCardComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
