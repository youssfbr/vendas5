import DataTable from "shared/components/DataTable";
import Footer from "shared/components/Footer";
import NavBar from "shared/components/NavBar";

const App = () => {
  return (
    <>
      <NavBar />
      <div className="container bg-light">
        <h1 className="text-primary">Olá Mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
};

export default App;
