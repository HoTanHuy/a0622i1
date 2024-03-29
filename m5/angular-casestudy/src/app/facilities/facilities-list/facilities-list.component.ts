import {Component, OnInit} from '@angular/core';
import {IFacility} from '../../model/ifacility';
import {FacilityService} from '../../service/facility.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-facilities-list',
  templateUrl: './facilities-list.component.html',
  styleUrls: ['./facilities-list.component.css']
})
export class FacilitiesListComponent implements OnInit {

  page = 1;
  facilities: IFacility[] = [];
  facilityDelete: IFacility = {};

  constructor(private facilityService: FacilityService,
              private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.facilityService.getAllFacility().subscribe((data) => {
      this.facilities = data;
    });
  }

  showInfo(facility: IFacility) {
    this.facilityDelete = facility;
  }

  delete(id: string) {
    this.facilityService.deleteFacility(id).subscribe(
      () => {
      },
      () => {
      },
      () => {
        this.toast.success("Xóa dịch vụ thành công");
        this.getAll();
      }
    );
  }
}
