// Encontrar se um elemento existe ou não e atualizar o array

function atualizarColecaoVegetais (vegetais, vegetal) {
    if (vegetais.indexOf(vegetal) === -1) {
        vegetais.push(vegetal);
        console.log('Nova coleção de vegetais é : ' + vegetais);
    } else if (vegetais.indexOf(vegetal) > -1) {
        console.log(vegetal + ' já existe na coleção de vegetais.');
    }
}

var vegetais = ['batata', 'tomate', 'pimenta', 'pimentao'];

atualizarColecaoVegetais(vegetais, 'espinafre');
// Nova coleção de vegatais é : batata,tomate,pimenta,pimentao,espinafre
atualizarColecaoVegetais(vegetais, 'espinafre');
// espinafre já existe na coleção de vegetais.