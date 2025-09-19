const modal = document.querySelector('.instructions-modal')
const openInstructions = document.querySelector('.instruction-button')
const exitModal = document.querySelector('.exit-button-modal')
openInstructions.addEventListener("click", ()=>{
    modal.showModal();
    console.log("HELLO!");
});

exitModal.addEventListener("click", ()=>{
    modal.close();
});


