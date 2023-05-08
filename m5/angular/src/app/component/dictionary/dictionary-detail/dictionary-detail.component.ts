import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {DictionaryService} from '../../../service/dictionary.service';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {

  word: any;

  constructor(private route: ActivatedRoute, private dictionaryService: DictionaryService) { }

  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');
    this.word = this.dictionaryService.getWordById(id);
  }

}
