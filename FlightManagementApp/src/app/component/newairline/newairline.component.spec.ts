import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewairlineComponent } from './newairline.component';

describe('NewairlineComponent', () => {
  let component: NewairlineComponent;
  let fixture: ComponentFixture<NewairlineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewairlineComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewairlineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
