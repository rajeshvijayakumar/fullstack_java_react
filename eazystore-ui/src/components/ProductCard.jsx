import React from "react";
import Price from "./Price";

export default function ProductCard({ product }) {
  return (
    <div className="product-card">
      <div className="product-card-image-container">
        <img
          className="product-card-image"
          src={product.imageUrl}
          alt={product.name}
        />
      </div>
      <div className="product-card-details">
        <h2 className="product-card-title">{product.name}</h2>
        <p className="product-card-description">{product.description}</p>

        <div className="product-card-footer">
          <div className="product-card-price">
            <Price currency="₹" price={product.price} />
          </div>
        </div>
      </div>
    </div>
  );
}
