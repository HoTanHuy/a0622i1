import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-fibonacci',
  templateUrl: './fibonacci.component.html',
  styleUrls: ['./fibonacci.component.css']
})
export class FibonacciComponent implements OnInit {
  sum: number;

  constructor() {
  }

  ngOnInit(): void {
  }

  fibonacciSum(n) {
    if (n <= 0) {
      this.sum = 0;
      return this.sum; // nếu n <= 0 thì trả về 0
    }
    if (n === 1) {
      this.sum = 1;
      return this.sum; // nếu n = 1 thì trả về 1
    }
    this.sum = this.fibonacci(n) + this.fibonacciSum(n - 1);
    return this.sum; // tính giá trị của số thứ n trong dãy Fibonaci
  }

  fibonacci(n) {
    if (n <= 0) {
      return 0; // nếu n <= 0 thì trả về 0
    }
    if (n === 1) {
      return 1; // nếu n = 1 thì trả về 1
    }
    return this.fibonacci(n - 1) + this.fibonacci(n - 2);
  }

}
