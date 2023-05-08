import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {YoutubePlaylistComponent} from './component/practice/youtube/youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './component/practice/youtube/youtube-player/youtube-player.component';
import {DictionaryPageComponent} from './component/dictionary/dictionary-page/dictionary-page.component';
import {DictionaryDetailComponent} from './component/dictionary/dictionary-detail/dictionary-detail.component';


const routes: Routes = [
  { path: '', component: DictionaryPageComponent },
  { path: 'dictionary/:id', component: DictionaryDetailComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
