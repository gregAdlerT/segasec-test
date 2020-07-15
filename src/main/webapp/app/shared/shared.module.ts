import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { LibappSharedLibsModule, LibappSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [LibappSharedLibsModule, LibappSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [LibappSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class LibappSharedModule {
  static forRoot() {
    return {
      ngModule: LibappSharedModule
    };
  }
}
