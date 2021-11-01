import ImgDark from 'assets/img/alisson_logo.svg';

const NavBar = () => {
  return (
    <div className="d-flex flex-column flex-md-row align-items-center pb-2 mb-4 border-bottom bg-white shadow-sm">
      <div className="container">
        <nav className="my-2 my-md-3 mr-md-3">
            <img src={ImgDark} alt="Alisson Youssf" width="120" />
        </nav>
      </div>
    </div>
  );
};

export default NavBar;
