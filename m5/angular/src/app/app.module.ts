import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PetComponent } from './component/practice/pet/pet.component';
import { ArticleComponent } from './component/hackernews/article/article.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LikeComponent } from './component/hackernews/like/like.component';
import { NavbarComponent } from './component/hackernews/navbar/navbar.component';
import { FooterComponent } from './component/hackernews/footer/footer.component';
import { NameCardComponent } from './component/practice/name-card/name-card.component';
import { ProgressBarComponent } from './component/practice/progress-bar/progress-bar.component';
import { RatingBarComponent } from './component/rating-bar/rating-bar.component';
import { FibonacciComponent } from './component/fibonacci/fibonacci.component';
import { TodoComponent } from './component/practice/todo/todo.component';
import { RegisterComponent } from './component/register/register.component';
import { LoginComponent } from './component/login/login.component';
import { TimelinesComponent } from './component/practice/timelines/timelines.component';
import { YoutubePlaylistComponent } from './component/practice/youtube/youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './component/practice/youtube/youtube-player/youtube-player.component';
import { CalculatorComponent } from './component/calculator/calculator.component';
import { ColorComponent } from './component/color/color.component';
import { CountdownTimerComponent } from './component/countdown-timer/countdown-timer.component';
import { DictionaryPageComponent } from './component/dictionary/dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './component/dictionary/dictionary-detail/dictionary-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    PetComponent,
    ArticleComponent,
    LikeComponent,
    NavbarComponent,
    FooterComponent,
    NameCardComponent,
    ProgressBarComponent,
    RatingBarComponent,
    FibonacciComponent,
    TodoComponent,
    RegisterComponent,
    LoginComponent,
    TimelinesComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
    CalculatorComponent,
    ColorComponent,
    CountdownTimerComponent,
    DictionaryPageComponent,
    DictionaryDetailComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
