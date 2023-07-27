const InsigniaDaMissao = ({ urlInsignia, urlWikipedia }) => {
  const clickComponente = () => {
    console.log("clicou na imagem", urlInsignia);
  };

  return (
    <div className="insignia">
      <h2>Insignia da missão:</h2>
      <img
        src={urlInsignia}
        alt="Insignia da Missão"
        onClick={clickComponente}
      />
      <a href={urlWikipedia}>Wikipedia</a>
    </div>
  );
};

export default InsigniaDaMissao;
