export default function Hello() {
    const a = 5;
    const b = 44;

    function calc() {
        return a + b;
    }

    return (
        <>
            <h1>Hello</h1>
            <h2>{calc()}</h2>
        </>
    )
}