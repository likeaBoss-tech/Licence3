import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {StudentViewComponent} from "./student-view/student-view.component";
import {AuthComponent} from "./auth/auth.component";
import {SingleStudentComponent} from "./single-student/single-student.component";
import {FourOhFourComponent} from "./four-oh-four/four-oh-four.component";
import {AuthGuard} from "./services/auth-guard.service";
import { EditStudentComponent } from './edit-student/edit-student.component';
import { UserListComponent } from './user-list/user-list.component';
import { NewUserComponent } from './new-user/new-user.component';

const routes: Routes = [
  { path: '', pathMatch:'full', redirectTo: 'students' },
  { path: 'students', canActivate: [AuthGuard], component: StudentViewComponent },
  { path: 'auth', component: AuthComponent },
  { path: 'students/:id', canActivate: [AuthGuard], component: SingleStudentComponent },
  { path: 'not-found', component: FourOhFourComponent },
  { path: '**', redirectTo: 'not-found' },
  { path: 'edit', canActivate: [AuthGuard], component: EditStudentComponent },
  { path: 'users', component: UserListComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
