export type ProductCategory = 'EBOOK' | 'CREATIVE_KIT' | 'EDUCATIONAL_TOY' | 'DIGITAL_RESOURCE' | 'PARENT_GUIDE';

export interface Product {
  id: number;
  title: string;
  description: string;
  price: number;
  originalPrice?: number;
  imageUrl?: string;
  badge?: string;
  rating?: number;
  reviewCount?: number;
  category: ProductCategory;
  featured: boolean;
  bestSeller: boolean;
  isNew: boolean;

  sellerName: string;
  sellerSlug: string;
}