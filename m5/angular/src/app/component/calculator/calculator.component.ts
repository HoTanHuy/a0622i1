import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  num1: number;
  num2: number;
  operator: string;
  result: number;

  calculate() {
    if (this.operator === 'add') {
      this.result = this.num1 + this.num2;
    } else if (this.operator === 'subtract') {
      this.result = this.num1 - this.num2;
    } else if (this.operator === 'multiply') {
      this.result = this.num1 * this.num2;
    } else if (this.operator === 'divide') {
      this.result = this.num1 / this.num2;
    }
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
