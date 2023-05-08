import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  private words = [
    {id: 1, en: 'hello', vi: 'xin chào'},
    {id: 2, en: 'world', vi: 'thế giới'},
    {id: 3, en: 'goodbye', vi: 'tạm biệt'}
  ];

  getAllWords() {
    return this.words;
  }

  getWordById(id: number) {
    return this.words.find(word => word.id === id);
  }
  constructor() { }
}
