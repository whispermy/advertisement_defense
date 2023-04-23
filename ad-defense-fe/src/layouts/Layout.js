import React from "react";
import Header from "./Header";
import Footer from "./Footer";

const Layout = ({ children }) => {
  return (
    <>
      <Header />
      <div style={{ backgroundColor: "#5a5a5a" }}>{children}</div>
      <Footer />
    </>
  );
};

export default Layout;
