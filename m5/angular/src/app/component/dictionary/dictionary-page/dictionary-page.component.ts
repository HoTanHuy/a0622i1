import { Component, OnInit } from '@angular/core';
import {DictionaryService} from '../../../service/dictionary.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {

  words: any[];

  constructor(private dictionaryService: DictionaryService, private router: Router) { }

  ngOnInit() {
    this.words = this.dictionaryService.getAllWords();
  }

  showDetail(id: number) {
    this.router.navigate(['/dictionary', id]);
  }

}
