import { Component, OnInit, Inject, Input, Output } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { FormBuilder, FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms';
import {MAT_RADIO_DEFAULT_OPTIONS } from '@angular/material';
import {AppServiceService} from './../app-service.service';
import {UserDTO} from './../user-dto';

@Component({
  selector: 'app-user-dialog',
  templateUrl: './user-dialog.component.html',
  styleUrls: ['./user-dialog.component.scss'],
  providers: [
    {provide: MAT_RADIO_DEFAULT_OPTIONS, useValue: { color: 'accent' }}
    // ,{ provide: MAT_DIALOG_DATA, useValue: [] }
  ]
})
export class UserDialogComponent implements OnInit {


  public dialogFormGroup: FormGroup;
  public login = true;

  constructor(
    private formBuilder: FormBuilder,
    private dialogRef: MatDialogRef<UserDialogComponent>,
    @Inject(MAT_DIALOG_DATA) data,
    private service: AppServiceService) {
     }

  ngOnInit() {
    // this.dialogFormGroup = new FormGroup({
    //   gender: new FormControl('', Validators.required),
    //   lastName: new FormControl('', Validators.required),
    //   firstName: new FormControl('', Validators.required),
    //   email: new FormControl('', Validators.compose([Validators.email, Validators.required])),
    //   password: new FormControl('', Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')])),
    //   // tslint:disable-next-line: max-line-length
    //   confirmPassword: new FormControl('', Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}'), this.validateAreEqual.bind(this)]))
    // });
    this.dialogFormGroup = this.formBuilder.group({
      gender: ['', Validators.required],
      lastName: ['', Validators.required],
      firstName: new FormControl('', Validators.required),
      email: ['', Validators.compose([Validators.email, Validators.required])],
      // passwords: this.formBuilder.group({
          password: ['', Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')])],
          // tslint:disable-next-line: max-line-length
          confirmPassword: ['', []]
          // confirmPassword: ['', Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')])]
      // }, {validator: this.passwordConfirming}),
    });
    const confirmPasswordControl = this.dialogFormGroup.get('confirmPassword');
    confirmPasswordControl.setValidators(Validators.compose([Validators.required, Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}'), this.validateAreEqual.bind(this)]));
  
  }

  private validateAreEqual(fieldControl: FormControl) {
    console.log("fieldControl START");
    console.log(fieldControl);
    console.log("fieldControl END");
    console.log("this.dialogFormGroup START");
    console.log(this.dialogFormGroup);
    console.log("this.dialogFormGroup END");
    return fieldControl.value === this.dialogFormGroup.get('password').value ? null : {
        NotEqual: true
    };
  }

  // passwordConfirming(c: AbstractControl): { invalid: boolean } {
  //   console.log(c);
  //   if (c.get('password').value !== c.get('confirmPassword').value) {
  //       return {invalid: true};
  //   }
  // }

  save() {
    let userDTO = new UserDTO(0,'','','',this.dialogFormGroup.get('email').value,this.dialogFormGroup.get('password').value,'','','','','','','','','',0,0,'',0,0,0,0,0,0,0,'');
    if (this.login) {
      this.service.login
    }
    //this.dialogRef.close(this.dialogFormGroup.value);
  }

  close() {
    console.log(this.dialogRef);
    console.log('CLOSE CLICKED');
    this.dialogRef.close(true);
  }

}
