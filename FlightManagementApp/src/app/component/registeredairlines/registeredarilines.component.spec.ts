import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisteredarilinesComponent } from './registeredarilines.component';

describe('RegisteredarilinesComponent', () => {
  let component: RegisteredarilinesComponent;
  let fixture: ComponentFixture<RegisteredarilinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisteredarilinesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegisteredarilinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
