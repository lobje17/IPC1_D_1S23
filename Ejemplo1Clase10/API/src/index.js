import express from "express";
/* Morgan permitira ver las peticiones en consola */
import morgan from "morgan"

const app = express();
const port = 3000;

app.use(morgan('tiny'))

app.listen(port, ()=>{
    console.log("Escuchando en el puerto "+port)
});

const datos = {
    nombre: "nombre",
    edad: 25
}

app.get('/', (req, res)=>{
    console.log(req)
    res.send('Inicio de la api')
})

app.get('/hola', (req, res)=>{
    console.log(JSON.stringify(req.body))
    res.send('Hola desde la api!!')
})


app.get('/login', (req, res)=>{
    res.send('Hola desde el login')
})


app.post('/registro', (req, res)=>{
    console.log(req.query)
    res.json(datos)
})


