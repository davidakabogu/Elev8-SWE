// geo.interface.ts
interface Geo {
  lat: string;
  lng: string;
}

// address.interface.ts
interface Address {
  street: string;
  suite: string;
  city: string;
  zipcode: string;
  geo: Geo;
}

// user.interface.ts
export default interface User {
  id: number;
  name: string;
  username: string;
  email: string;
  address: Address;
}

// Now you can use these interfaces in your Angular components or services.
