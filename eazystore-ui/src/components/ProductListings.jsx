import React, { useMemo } from "react";
import ProductCard from "./ProductCard";
import SearchBox from "./SearchBox";
import { useState } from "react";

export default function ProductListings({ products }) {
  const [searchText, setSearchText] = useState("");

  const filteredAndSortedProducts = useMemo(() => {
    if (!Array.isArray(products)) {
      return [];
    }

    let filteredProducts = products.filter(
      (product) =>
        product.name.toLowerCase().includes(searchText.toLowerCase()) ||
        product.description.toLowerCase().includes(searchText.toLowerCase()),
    );

    return filteredProducts.slice().sort((a,b) => {
        return parseInt(b.popularity) - parseInt(a.popularity);
    });
  }, [products, searchText]);

  function handleSearchChange(inputSearch) {
    setSearchText(inputSearch);
  }

  return (
    <div className="max-w-[1152px] mx-auto">
      <div className="flex flex-cols sm:flex-rows justify-between items-center gap-4 pt-12">
        <SearchBox
          label="Search"
          placeholder="Search products..."
          value={searchText}
          handlesearch={(value) => handleSearchChange(value)}
        />
      </div>
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-y-8 gap-x-6 py-12">
        {filteredAndSortedProducts.length > 0 ? (
          filteredAndSortedProducts.map((product) => (
            <ProductCard key={product.productId} product={product} />
          ))
        ) : (
          <p className="text-center font-primary font-bold text-lg text-primary">
            No products found.
          </p>
        )}
      </div>
    </div>
  );
}
