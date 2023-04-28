import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {Register} from '../../interface/register';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  rfRegister: FormGroup;

  register: Register;

  constructor() {
  }

  ngOnInit(): void {
    this.rfRegister = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(8)]),
      confirmPassword: new FormControl('', [Validators.required, Validators.minLength(8)]),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84|0\d{9,10}$/)])
    });
  }

  // checkPassword(control: AbstractControl) {
  //   const confirmPassword = control.get('confirmPassword').value;
  //   if (confirmPassword !== control.get('password').value) {
  //     return {invalidPassword: true};
  //   }
  //   return null;
  // }

}
