import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";

export default function Home()  {
  const products = [];
  return (
    <div className="home-container">
      <PageHeading title="Explore Eazy Stickers!">
        Add a touch of creativity to your space with your wide range of fun and
        unique stickers. Perfect for any occasion!
      </PageHeading>
      <ProductListings products={products}/>
    </div>
  );
};
