import { Component, OnInit } from '@angular/core';
import {DateUtilService} from '../../../service/date-util.service';

@Component({
  selector: 'app-timelines',
  templateUrl: './timelines.component.html',
  styleUrls: ['./timelines.component.css']
})
export class TimelinesComponent implements OnInit {
  output: string;

  constructor(private dateUntilService: DateUtilService) { }

  ngOnInit(): void {
  }

  onChange(value: string) {
    this.output = this.dateUntilService.getDiffToNow(value);
  }
}
