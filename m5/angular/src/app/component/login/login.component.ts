import {Component, OnInit} from '@angular/core';
import {User} from '../../interface/user';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = {
    email: 'hotanhuy2000@gmail.com',
    password: 'nhokquay2109'
  };
  rfUser: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.rfUser = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)])
    });
  }

}
