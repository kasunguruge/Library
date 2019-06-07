import { Component, OnInit } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { ReservationService } from '../reservation.service';
import { Students } from '../students';
import { forEach } from '@angular/router/src/utils/collection';
@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {

  reservation: Observable<Students[]>;
  books:Object[];
  constructor(private restclient:ReservationService) { }
  
  ngOnInit() {

    // this.restclient.getBooks().subscribe(
    //   (reservationlist)=> this.reservation=reservationlist,
    //      (err)=> console.log(err)
    // );
    this.upDate();
    
  }
  upDate(){
    this.reservation=this.restclient.getBooks();
  }
  deleteReservations(id:Number){
    console.log(id);
    this.restclient.deleteReservations(id).subscribe((d)=>
    
    this.upDate());
    
  }
}
