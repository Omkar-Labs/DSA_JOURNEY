type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    type returnType = boolean | string;
    const objFunc:ToBeOrNotToBe = {
        toBe:(val1:any):boolean=>{
            if (val === val1) return true;
            else throw new Error(`Not Equal`);
        },
        notToBe:(val1:any):boolean=>{
            if(val1!==val) return true;
            else throw new Error(`Equal`);
        }
    }
    return objFunc;
};
/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */