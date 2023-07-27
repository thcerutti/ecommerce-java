const InsigniaDaMissao = ({ urlInsignia }) => {
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
    </div>
  );
};

export default InsigniaDaMissao;
