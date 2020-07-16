export interface IReview {
  book?: string;
  review?: string;
}

export class Review implements IReview {
  constructor(public book?: string, public review?: string) {}
}
