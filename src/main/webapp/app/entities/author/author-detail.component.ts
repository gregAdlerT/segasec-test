import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IAuthor } from 'app/shared/model/author.model';
import { AuthorService } from 'app/entities/author/author.service';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { JhiAlertService } from 'ng-jhipster';
import { IReview } from 'app/shared/model/Review';

@Component({
  selector: 'jhi-author-detail',
  templateUrl: './author-detail.component.html'
})
export class AuthorDetailComponent implements OnInit {
  author: IAuthor;
  reviews = [];

  constructor(
    protected activatedRoute: ActivatedRoute,
    protected authorService: AuthorService,
    protected jhiAlertService: JhiAlertService
  ) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ author }) => {
      this.author = author;
    });
  }

  previousState() {
    window.history.back();
  }

  onGetReview(name: string) {
    this.authorService.getAuthorReview(name).subscribe(
      (res: HttpResponse<IReview[]>) => {
        res.body.forEach(r => this.reviews.push('book: ' + r.book + '\n review: ' + r.review));
      },
      (res: HttpErrorResponse) => this.onError(res.message)
    );
  }

  protected onError(errorMessage: string) {
    this.jhiAlertService.error(errorMessage, null, null);
  }
}
