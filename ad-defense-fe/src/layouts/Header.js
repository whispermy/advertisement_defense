import React from "react";

const Header = () => {
  return (
    <header>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            Ad Defense
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarColor05"
            aria-controls="navbarColor03"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarColor03">
            <ul class="navbar-nav me-auto">
              <li class="nav-item">
                <a class="nav-link active" href="#">
                  Home
                  <span class="visually-hidden">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  2
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  3
                </a>
              </li>
            </ul>
            <form class="d-flex">
              <button type="button" class="btn btn-dark">
                내 정보
              </button>
            </form>
          </div>
        </div>
      </nav>
    </header>
  );
};

export default Header;
