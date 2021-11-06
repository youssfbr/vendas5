import { Link } from "react-router-dom";
import Footer from "shared/components/Footer";
import NavBar from "shared/components/NavBar";

const Home = () => {
  return (
    <>
      <NavBar />
      <main>
        <div className="container py-4">
          <div className="p-5 mb-4 bg-light rounded-3">
            <div className="container-fluid py-5">
              <h1 className="display-4 ">Vendas</h1>

              <p className="lead">
                Analise o desempenho das suas vendas por diferentes perspectivas
              </p>
              <hr />
              <p>
                Esta aplicação consiste em exibir um dashboard a partir de dados
                fornecidos por um back end construído com Spring Boot.
              </p>
              <Link className="btn btn-primary btn-lg mt-3" to="/dashboard">
                Acessar dashboard
              </Link>
            </div>
          </div>
        </div>
      </main>
      <Footer />
    </>
  );
};

export default Home;
