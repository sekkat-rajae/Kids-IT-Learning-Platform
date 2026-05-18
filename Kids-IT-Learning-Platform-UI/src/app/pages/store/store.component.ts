import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from '../../components/navbar/navbar.component';
import { StoreService } from '../../services/store.service';
import { Product } from '../../models/store.model';

@Component({
  selector: 'app-store',
  standalone: true,
  imports: [CommonModule, NavbarComponent],
  templateUrl: './store.component.html',
  styleUrl: './store.component.css'
})
export class StoreComponent implements OnInit {
  products: Product[] = [];
  isLoading = true;

  constructor(private storeService: StoreService) {}

  ngOnInit(): void {
    this.storeService.getProducts().subscribe({
      next: (products) => {
        this.products = products;
        this.isLoading = false;
      },
      error: () => {
        this.isLoading = false;
      }
    });
  }
}
