import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'author',
        loadChildren: () => import('./author/author.module').then(m => m.LibraryAuthorModule)
      },
      {
        path: 'book',
        loadChildren: () => import('./book/book.module').then(m => m.LibraryBookModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class LibappEntityModule {}
