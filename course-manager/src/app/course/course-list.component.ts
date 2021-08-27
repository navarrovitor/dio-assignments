import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component({
  selector:'app-course-list', 
  templateUrl:'./course-list.component.html'
})
export class CourseListComponent implements OnInit{
  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }

}