import { Component, OnInit } from '@angular/core';
import {SongService} from '../../../../service/song.service';
import {Song} from '../../../../interface/song';

@Component({
  selector: 'app-youtube-playlist',
  templateUrl: './youtube-playlist.component.html',
  styleUrls: ['./youtube-playlist.component.css']
})
export class YoutubePlaylistComponent implements OnInit {
  playList: Song[] = [];

  constructor(private songService: SongService) { }

  ngOnInit(): void {
    this.getAll();
  }

  private getAll() {
    this.playList = this.songService.playList;
  }
}
