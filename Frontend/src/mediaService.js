export async function mediaCreate(data) {
    return await fetch(`http://localhost:8080/newMedia`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({data}.data)
    });
}

export async function getAllMedia() {
    const response = await fetch('http://localhost:8080/allMedia');
    return await JSON.parse((await response.text()))
}