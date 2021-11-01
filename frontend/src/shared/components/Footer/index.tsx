const Footer = () => {
  return (
    <div>
      <footer className="footer mt-auto py-3 bg-dark ">
        <div className="container">
          <p className="text-light">
            App desenvolvido por{" "}
            <a
              href="https://github.com/youssfbr"
              target="_blank"
              rel="noreferrer"
            >
              Alisson Youssf
            </a>
          </p>
          <p className="text-light">
            <small>
              <strong>Semana Spring React</strong>
              <br />
              Evento promovido pela escola DevSuperior:{" "}
              <a
                href="https://www.instagram.com/youssf_br/"
                target="_blank"
                rel="noreferrer"
              >
                @youssf_br
              </a>
            </small>
          </p>
        </div>
      </footer>
    </div>
  );
};

export default Footer;
