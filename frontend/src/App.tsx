import NavBar from "shared/components/NavBar";
import BarChart from "shared/components/BarChart";
import DonutChart from "shared/components/DonutChart";
import DataTable from "shared/components/DataTable";
import Footer from "shared/components/Footer";

const App = () => {
  return (
    <>
      <NavBar />
      <div className="container bg-light">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3"> 
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <BarChart /> 
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas Vendas</h5>
            <DonutChart /> 
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas Vendas</h2>

        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  );
};

export default App;
